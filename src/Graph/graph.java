package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

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
		public void BFS(String v1, String v2) {

			LinkedList<pair> queue = new LinkedList<>();
			String path = "";
			HashMap<String, Boolean> map = new HashMap<>();
			queue.addLast(new pair(v1, path + v1));
			while (!queue.isEmpty()) {
				// 1 remove pair and to map
				pair rv = queue.removeFirst();
				String vname = rv.vname;

				if (map.containsKey(vname)) {
					continue;
				}

				map.put(vname, true);

				// 2 if direct edge present then return true
				if (containsedge(vname, v2)) {
					System.out.println(rv.path + v2);
					break;
				}

				// 3 add nbrs to queue
				HashMap<String, Integer> nbr = vtces.get(vname).nbrs;
				ArrayList<String> keys = new ArrayList<>(nbr.keySet());
				for (String string : keys) {
					if (!map.containsKey(string)) {
						queue.addLast(new pair(string, rv.path + string));
					}
				}
			}

		}

		// shortest path bw two nodes
		public void DFS(String v1, String v2) {

			LinkedList<pair> stack = new LinkedList<>();
			String path = "";
			HashMap<String, Boolean> map = new HashMap<>();
			stack.addFirst(new pair(v1, path + v1));
			while (!stack.isEmpty()) {
				// 1 remove pair and to map
				pair rv = stack.removeFirst();
				String vname = rv.vname;

				if (map.containsKey(vname)) {
					continue;
				}

				map.put(vname, true);

				// 2 if direct edge present then return true
				if (containsedge(vname, v2)) {
					System.out.println(rv.path + v2);
					break;
				}

				// 3 add nbrs to queue
				HashMap<String, Integer> nbr = vtces.get(vname).nbrs;
				ArrayList<String> keys = new ArrayList<>(nbr.keySet());
				for (String string : keys) {
					if (!map.containsKey(string)) {
						stack.addFirst(new pair(string, rv.path + string));
					}
				}
			}

		}

		public void BFT() {

			LinkedList<pair> queue = new LinkedList<>();
			ArrayList<String> keys = new ArrayList<String>(vtces.keySet());
			HashMap<String, Boolean> map = new HashMap<>();
			for (String string : keys) {
				if (map.containsKey(string)) {
					continue;
				}

				String path = "";
				queue.addLast(new pair(string, path + string));
				while (!queue.isEmpty()) {
					// 1 remove pair and to map
					pair rv = queue.removeFirst();
					String vname = rv.vname;

					if (map.containsKey(vname)) {
						continue;
					}

					map.put(vname, true);

					// 2 if direct edge present then return true
					System.out.println(vname + " via " + rv.path);

					// 3 add nbrs to queue
					HashMap<String, Integer> nbr = vtces.get(vname).nbrs;
					ArrayList<String> keys1 = new ArrayList<>(nbr.keySet());
					for (String string1 : keys1) {
						if (!map.containsKey(string1)) {
							queue.addLast(new pair(string1, rv.path + string1));
						}
					}
				}

			}
		}

		public void DFT() {

			LinkedList<pair> stack = new LinkedList<>();
			ArrayList<String> keys = new ArrayList<String>(vtces.keySet());
			HashMap<String, Boolean> map = new HashMap<>();
			for (String string : keys) {
				if (map.containsKey(string)) {
					continue;
				}

				String path = "";
				stack.addFirst(new pair(string, path + string));
				while (!stack.isEmpty()) {
					// 1 remove pair and to map
					pair rv = stack.removeFirst();
					String vname = rv.vname;

					if (map.containsKey(vname)) {
						continue;
					}

					map.put(vname, true);

					// 2 if direct edge present then return true
					System.out.println(vname + " via " + rv.path);

					// 3 add nbrs to queue
					HashMap<String, Integer> nbr = vtces.get(vname).nbrs;
					ArrayList<String> keys1 = new ArrayList<>(nbr.keySet());
					for (String string1 : keys1) {
						if (!map.containsKey(string1)) {
							stack.addFirst(new pair(string1, rv.path + string1));
						}
					}
				}

			}
		}

		// is cycle -> in bft if process contains ... then return true
		public boolean iscyclic() {

			LinkedList<pair> queue = new LinkedList<>();
			ArrayList<String> keys = new ArrayList<String>(vtces.keySet());
			HashMap<String, Boolean> map = new HashMap<>();
			for (String string : keys) {
				if (map.containsKey(string)) {
					continue;
				}

				String path = "";
				queue.addLast(new pair(string, path + string));
				while (!queue.isEmpty()) {
					// 1 remove pair and to map
					pair rv = queue.removeFirst();
					String vname = rv.vname;

					if (map.containsKey(vname)) {
//						continue;
						return true;
					}

					map.put(vname, true);

					// 2 if direct edge present then return true
//					System.out.println(vname + " via " + rv.path);

					// 3 add nbrs to queue
					HashMap<String, Integer> nbr = vtces.get(vname).nbrs;
					ArrayList<String> keys1 = new ArrayList<>(nbr.keySet());
					for (String string1 : keys1) {
						if (!map.containsKey(string1)) {
							queue.addLast(new pair(string1, rv.path + string1));
						}
					}
				}

			}
			return false;
		}

		// is conected -> in bft if process contains we continue ... so below region
		// code is visted only once , if visted twice or more than graph is disconected
		public boolean isconnected() {

			LinkedList<pair> queue = new LinkedList<>();
			ArrayList<String> keys = new ArrayList<String>(vtces.keySet());
			HashMap<String, Boolean> map = new HashMap<>();
			int flag = 0;
			for (String string : keys) {
				if (map.containsKey(string)) {
					continue;
				}
				flag++;
				String path = "";
				queue.addLast(new pair(string, path + string));
				while (!queue.isEmpty()) {
					// 1 remove pair and to map
					pair rv = queue.removeFirst();
					String vname = rv.vname;

					if (map.containsKey(vname)) {
						continue;
					}

					map.put(vname, true);

					// 2 if direct edge present then return true
//					System.out.println(vname + " via " + rv.path);

					// 3 add nbrs to queue
					HashMap<String, Integer> nbr = vtces.get(vname).nbrs;
					ArrayList<String> keys1 = new ArrayList<>(nbr.keySet());
					for (String string1 : keys1) {
						if (!map.containsKey(string1)) {
							queue.addLast(new pair(string1, rv.path + string1));
						}
					}
				}

			}

			if (flag >= 2) {
				return false;
			} else {
				return true;
			}
		}

		// is tree - > not cyclic and contected
		public boolean istree() {
			return !iscyclic() && isconnected();
		}

		public ArrayList<ArrayList<String>> getcomponents() {

			LinkedList<pair> queue = new LinkedList<>();
			ArrayList<String> keys = new ArrayList<String>(vtces.keySet());
			ArrayList<ArrayList<String>> ans = new ArrayList<>();
			HashMap<String, Boolean> map = new HashMap<>();
			for (String string : keys) {
				if (map.containsKey(string)) {
					continue;
				}

				ArrayList<String> subans = new ArrayList<>();
				String path = "";
				queue.addLast(new pair(string, path + string));
				while (!queue.isEmpty()) {
					// 1 remove pair and to map
					pair rv = queue.removeFirst();
					String vname = rv.vname;

					if (map.containsKey(vname)) {
						continue;
					}

					map.put(vname, true);

					// 2 if direct edge present then return true
//					System.out.println(vname + " via " + rv.path);
					subans.add(vname);

					// 3 add nbrs to queue
					HashMap<String, Integer> nbr = vtces.get(vname).nbrs;
					ArrayList<String> keys1 = new ArrayList<>(nbr.keySet());
					for (String string1 : keys1) {
						if (!map.containsKey(string1)) {
							queue.addLast(new pair(string1, rv.path + string1));
						}
					}
				}
				ans.add(subans);
			}

			return ans;
		}

		// prims algo
		public static class pairprims implements Comparable<pairprims> {
			String vname;
			String pname;
			int wt;

			pairprims(String v, String p, int w) {
				this.vname = v;
				this.pname = p;
				this.wt = w;
			}

			public int compareTo(pairprims o) {
				// TODO Auto-generated method stub
				return this.wt - o.wt;
			}

		}

		public void prims() {
			PriorityQueue<pairprims> queue = new PriorityQueue<>();
			HashMap<String, Boolean> map = new HashMap<>();
			// suppose A is aquired from -1
			ArrayList<String> keys = new ArrayList<String>(vtces.keySet());
			for (String string : keys) {
				if (map.containsKey(string)) {
					continue;
				}
				queue.add(new pairprims(string, "-1", 0));
				while (!queue.isEmpty()) {
					// remove (works like min heap ... min wt vertex is removed)
					pairprims rv = queue.remove();
					if (map.containsKey(rv.vname)) {
						continue;
					}
					// mark
					map.put(rv.vname, true);

					// work
					if (rv.pname != "-1")
						System.out.println(" [ " + rv.vname + " via " + rv.pname + " @ " + rv.wt);

					// ad nbr
					HashMap<String, Integer> nbr = vtces.get(rv.vname).nbrs;
					ArrayList<String> keys1 = new ArrayList<>(nbr.keySet());
					for (String string1 : keys1) {
						if (!map.containsKey(string1)) {
							queue.add(new pairprims(string1, rv.vname, nbr.get(string1)));
						}
					}
				}
			}
		}

		// dijkstra shortest path algo (used bft)
		public static class pairdijk implements Comparable<pairdijk> {
			String vname;
			String pathsofar;
			int wt;

			pairdijk(String v, String p, int w) {
				this.vname = v;
				this.pathsofar = p;
				this.wt = w;
			}

			public int compareTo(pairdijk o) {
				// TODO Auto-generated method stub
				return this.wt - o.wt;
			}

		}

		public void dijkstra() {

			PriorityQueue<pairdijk> queue = new PriorityQueue<>();
			ArrayList<String> keys = new ArrayList<String>(vtces.keySet());
			HashMap<String, Boolean> map = new HashMap<>();
			for (String string : keys) {
				if (map.containsKey(string)) {
					continue;
				}
				queue.add(new pairdijk(string, string, 0));
				while (!queue.isEmpty()) {
					// remove (works like min heap ... min wt vertex is removed)
					pairdijk rv = queue.remove();
					if (map.containsKey(rv.vname)) {
						continue;
					}
					// mark
					map.put(rv.vname, true);

					// work
//					if (rv.pathsofar != rv.vname)
					System.out.println(" [ " + rv.vname + " via " + rv.pathsofar + " @ " + rv.wt);

					// ad nbr
					HashMap<String, Integer> nbr = vtces.get(rv.vname).nbrs;
					ArrayList<String> keys1 = new ArrayList<>(nbr.keySet());
					for (String string1 : keys1) {
						if (!map.containsKey(string1)) {
							queue.add(new pairdijk(string1, rv.pathsofar + string1, rv.wt + nbr.get(string1)));
						}
					}
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		graph.addvtces("A");
		graph.addvtces("H");
		graph.addvtces("C");
		graph.addvtces("D");
		graph.addvtces("E");
		graph.addvtces("F");
		graph.addvtces("G");

		graph.addedge("A", "H", 1);
		graph.addedge("H", "C", 2);
		graph.addedge("A", "D", 3);
		graph.addedge("C", "D", 0);
		graph.addedge("D", "E", 5);
		graph.addedge("E", "F", 6);
		graph.addedge("E", "G", 7);
		graph.addedge("F", "G", 8);

		graph.display();

//		graph.removevtces("A");
//		graph.display();
//		graph.removeedge("D", "E");
//		graph.display();
//		System.out.println(graph.containsedge("B", "C"));
//		System.out.println(graph.containvtces("A"));
//		System.out.println(graph.noofedges());
//		System.out.println(graph.haspath("A", "C"));
//		graph.BFS("A", "F", new HashMap<String, Boolean>());
		graph.DFS("A", "F");
//		graph.BFT(new HashMap<String, Boolean>());
		System.out.println();
//		graph.DFT(new HashMap<String, Boolean>());
//		graph.removeedge("D", "E");
//		graph.removeedge("D", "C");
//		graph.removeedge("E", "G");
		System.out.println(graph.iscyclic());
		System.out.println(graph.isconnected());
		System.out.println(graph.istree());
		System.out.println(graph.getcomponents());
		graph.prims();
		System.out.println();
		graph.dijkstra();

	}

}