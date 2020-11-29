package ru.sapteh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        while (true) {
            int p = Integer.parseInt(reader.readLine());
            if (p != 100) {
                list.add(p);
            } else {
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                System.out.println(list.get(i));
            }
        }
    }
                                                                           
}