package com.company;

import com.company.branchingTasks.BranchingProgram;
import com.company.cyclesTasks.CyclesProgram;
import com.company.linearTasks.LinearProgram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выберите раздел заданий:\n" +
                "1. Линейные программы\n" +
                "2. Ветвления\n" +
                "3. Циклы\n");

        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        switch (select) {
            case 1: {
                LinearProgram linearProgram = new LinearProgram();
                linearProgram.select();
            }
            break;
            case 2: {
                BranchingProgram branchingProgram = new BranchingProgram();
                branchingProgram.select();
            }
            break;
            case 3: {
                CyclesProgram cyclesProgram = new CyclesProgram();
                cyclesProgram.select();
            }
            break;
        }
        input.close();
    }
}
