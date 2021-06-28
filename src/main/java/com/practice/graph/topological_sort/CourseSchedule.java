package com.practice.graph.topological_sort;

import com.practice.graph.DirectGraphAL;
import com.practice.graph.DirectGraphAL.Edge;

public class CourseSchedule {

  public boolean canComplete(int[][] p, int nv) {
    DirectGraphAL graphAL = new DirectGraphAL(p, nv);
    boolean[] v = new boolean[nv];
    boolean[] vis = new boolean[nv];
    for (int i = 0; i < nv; i++) {
      if (!v[i]) {
        if (find(graphAL, i, v, vis)) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean find(DirectGraphAL graphAL, int source, boolean[] v, boolean[] vis) {
    if (vis[source]) {
      return true;
    }

    if (v[source]) {
      return false;
    }

    v[source] = true;
    vis[source] = true;

    for (Edge e : graphAL.getEdges()[source]) {
      if (find(graphAL, e.getDestination(), v, vis)) {
        return true;
      }
    }
    vis[source] = false;
    return false;
  }
}
