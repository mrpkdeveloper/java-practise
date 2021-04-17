package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class graph {

	public static class Graph {
		private class vertex {
			HashMap<String, Integer> nbrs = new HashMap<>();
		}

		HashMap<String, vertex> vtces;

		Graph() {
			vtces = new HashMap<>();
		}

		public int numvtces() {
			return vtces.size();
		}

		public void addvtces(String vname) {
			vertex nbr = new vertex();
			vtces.put(vname, nbr);
		}

		public void removevtces(String vname) {

			HashMap<String, Integer> nbr = vtces.get(vname).nbrs;
			ArrayList<String> keys = new ArrayList<String>(nbr.keySet());
			for (String string : keys) {
				HashMap<String, Integer> nbrkey = vtces.get(string).nbrs;
				nbrkey.remove(vname);
			}
			vtces.remove(vname);

		}

		public boolean containvtces(String vname) {
			return vtces.containsKey(vname);
		}

		public int noofedges() {
			ArrayList<String> keys = new ArrayList<>(vtces.keySet());
			int edge = 0;
			for (String string : keys) {
				edge += vtces.get(string).nbrs.size();
			}
			return edge / 2;
		}

		public boolean containsedge(String vname1, String vname2) {
			if (vtces.containsKey(vname1) && vtces.containsKey(vname2)) {
				HashMap<String, Integer> nbr = vtces.get(vname1).nbrs;
				if (nbr == null) {
					return false;
				} else
					return nbr.containsKey(vname2);
			}
			return false;
		}

		public void addedge(String vname1, String vname2, int cost) {
			HashMap<String, Integer> nbrv1 = vtces.get(vname1).nbrs;
			HashMap<String, Integer> nbrv2 = vtces.get(vname2).nbrs;

			if (nbrv1 == null || nbrv2 == null || nbrv1.containsKey(vname1)) {
				return;
			}

			nbrv1.put(vname2, cost);
			nbrv2.put(vname1, cost);
		}

		public void removeedge(String vname1, String vname2) {
			HashMap<String, Integer> nbrv1 = vtces.get(vname1).nbrs;
			HashMap<String, Integer> nbrv2 = vtces.get(vname2).nbrs;

			if (nbrv1 == null || nbrv2 == null || nbrv1.containsKey(vname1)) {
				return;
			}

			nbrv1.remove(vname2);
			nbrv2.remove(vname1);

		}

		public void display() {

			System.out.println("----------------------------");
			ArrayList<String> vname = new ArrayList<String>(vtces.keySet());
			for (String string : vname) {
				HashMap<String, Integer> nbr = vtces.get(string).nbrs;
				System.out.println(string + " : " + nbr);
			}
			System.out.println("----------------------------");

		}

		public boolean haspath(String v1, String v2) {
			return haspath(v1, v2, new HashMap<String, Boolean>());
		}

		private boolean haspath(String v1, String v2, HashMap<String, Boolean> map) {
			if (containsedge(v1, v2)) {
				return true;
			}
			if (!containvtces(v1) || !containvtces(v2)) {
				return false;
			}

			HashMap<String, Integer> v1nbr = vtces.get(v1).nbrs;
			ArrayList<String> keys = new ArrayList<>(v1nbr.keySet());
			map.put(v1, true);

			for (String string : keys) {
				if (!map.containsKey(string) && haspath(string, v2, map)) {
					return true;
				}
			}

			return false;

		}

		public class pair {
			String vname;
			String path;

			pair(String name, String path) {
				this.vname = name;
				this.path = path;
			}
		}

		// shortest path bw two nodes
		public void BFS(String v1, String v2, HashMap<String, Boolean> map) {

			LinkedList<pair> queue = new LinkedList<>();
			String path = "";
			queue.addLast(new pair(v1, path + v1));
			while (!queue.isEmpty()) {
				pair rv = queue.removeFirst();
				String vname = rv.vname;
				map.put(vname, true);
				if (containsedge(vname, v2)) {
					System.out.println(rv.path + v2);
					break;
				}
				HashMap<String, Integer> nbr = vtces.get(vname).nbrs;
				ArrayList<String> keys = new ArrayList<>(nbr.keySet());
				for (String string : keys) {
					if (!map.containsKey(string)) {
						queue.addLast(new pair(string, rv.path + string));
					}
				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		graph.addvtces("A");
		graph.addvtces("B");
		graph.addvtces("C");
		graph.addvtces("D");

		graph.addedge("A", "B", 1);
		graph.addedge("B", "C", 2);
		graph.addedge("A", "D", 3);
		graph.addedge("C", "D", 4);

		graph.display();

//		graph.removevtces("A");
//		graph.display();
//		graph.removeedge("C", "D");
//		graph.display();
//		System.out.println(graph.containsedge("B", "C"));
//		System.out.println(graph.containvtces("A"));
//		System.out.println(graph.noofedges());
//		System.out.println(graph.haspath("A", "C"));
		graph.BFS("A", "C", new HashMap<String, Boolean>());

	}

}
