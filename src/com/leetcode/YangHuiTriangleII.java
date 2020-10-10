package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class YangHuiTriangleII {

    public List<Integer> getRow(int rowIndex) {
        int pre = 1;
        List<Integer> cur = new ArrayList<>();
        cur.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = 1; j < i; j++) {
                int tmp = cur.get(j);
                cur.set(j, pre + cur.get(j));
                pre = tmp;
            }
            cur.add(1);
        }
        return cur;
    }
}
