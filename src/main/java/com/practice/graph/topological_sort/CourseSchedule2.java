package com.practice.graph.topological_sort;

import com.practice.graph.DirectGraphAL;
import com.practice.graph.DirectGraphAL.Edge;
import java.util.Stack;

public class CourseSchedule2 {

  public int[] findSchedule(int[][] g, int nv) {
    DirectGraphAL dg = new DirectGraphAL(g, nv);
    boolean[] v = new boolean[nv];
    boolean[] vis = new boolean[nv];
    Stack<Integer> track = new Stack<>();
    for (int i = 0; i < nv; i++) {
      if (!v[i]) {
        if (find(dg, i, v, vis, track)) {
          return new int[]{};
        }
      }
    }
    int[] result = new int[nv];
    for (int i = 0; i < track.size(); i++) {
      result[i] = track.get(i);
    }
    return result;
  }

  private boolean find(DirectGraphAL dg, int i, boolean[] v, boolean[] vis, Stack<Integer> track) {
    if (vis[i]) {
      return true;
    }

    if (v[i]) {
      return false;
    }

    v[i] = true;
    vis[i] = true;

    for (Edge e : dg.getEdges()[i]) {
      if (find(dg, e.getDestination(), v, vis, track)) {
        return true;
      }
    }

    vis[i] = false;
    track.add(i);
    return false;
  }
}
