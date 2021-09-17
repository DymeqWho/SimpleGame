//package com.misiejuk;
//
//import java.util.*;
//
//public class Main {
//    private final static Map<Integer, Location> locations = new HashMap<>();
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        locations.put(0, new Location(0, "You are standing in front of a computer learning Java"));
//        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
//        locations.put(2, new Location(2, "You are at the top of a hill"));
//        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
//        locations.put(4, new Location(4, "You are in a valley before stream"));
//        locations.put(5, new Location(5, "You are in the forest"));
//
//        locations.get(1).addExit("W", 2);
//        locations.get(1).addExit("E", 3);
//        locations.get(1).addExit("S", 4);
//        locations.get(1).addExit("N", 5);
//
//        locations.get(2).addExit("N", 5);
//
//        locations.get(3).addExit("W", 1);
//
//        locations.get(4).addExit("N", 1);
//        locations.get(4).addExit("W", 2);
//
//        locations.get(5).addExit("S", 1);
//        locations.get(5).addExit("W", 2);
//
//        int loc = 1;
//        while (true) {
//            System.out.println(locations.get(loc).getDescription());
//            if (loc == 0) {
//                break;
//            }
//
//            Map<String, Integer> exits = locations.get(loc).getExits();
//            System.out.print("Available exits are: ");
//
//            for (String exit : exits.keySet()) {
//                System.out.print(exit + ", ");
//            }
//            System.out.println();
//
//            String direction = scanner.nextLine().toUpperCase();
//
//            String N1 = "N";
//            String N2 = "GO NORTH";
//            String N3 = "RUN NORTH";
//            String N4 = "NORTH";
//
//            String[] northArray = {N1, N2, N3, N4};
//
//            String S1 = "S";
//            String S2 = "GO SOUTH";
//            String S3 = "RUN SOUTH";
//            String S4 = "SOUTH";
//
//            String[] southArray = {S1, S2, S3, S4};
//
//            String E1 = "E";
//            String E2 = "GO EAST";
//            String E3 = "RUN EAST";
//            String E4 = "EAST";
//
//            String[] eastArray = {E1, E2, E3, E4};
//
//            String W1 = "W";
//            String W2 = "GO WEST";
//            String W3 = "RUN WEST";
//            String W4 = "WEST";
//
//            String[] westArray = {W1, W2, W3, W4};
//
//            String Q1 = "Q";
//            String Q2 = "QUIT";
//
//            String[] quitArray = {Q1, Q2};
//
//            Map<String, String[]> directions = new HashMap<>();
//            directions.put("N", northArray);
//            directions.put("S", southArray);
//            directions.put("E", eastArray);
//            directions.put("W", westArray);
//            directions.put("Q", quitArray);
//
//            String direction1 = goToDirection(direction, directions);
//
//            if (exits.containsKey(direction1)) {
//                loc = exits.get(direction1);
//            } else {
//                System.out.println("You cannot go in that direction!");
//            }
//        }
//    }
//
//    static String goToDirection(String direction, Map<String, String[]> directions) {
//        String[] temp;
//        int howManyArrays = directions.size();
//        String toReturnString = null;
//        for (int i = 0; i < howManyArrays; i++) {
//            if (1 == howManyArrays - i) {
//                temp = directions.get("N");
//                if (isThisInMap(temp, direction)) {
//                    toReturnString = "N";
//                }
//            } else if (2 == howManyArrays - i) {
//                temp = directions.get("S");
//                if (isThisInMap(temp, direction)) {
//                    toReturnString = "S";
//                }
//            } else if (3 == howManyArrays - i) {
//                temp = directions.get("E");
//                if (isThisInMap(temp, direction)) {
//                    toReturnString = "E";
//                }
//            } else if (4 == howManyArrays - i) {
//                temp = directions.get("W");
//                if (isThisInMap(temp, direction)) {
//                    toReturnString = "W";
//                }
//            } else {
//                temp = directions.get("Q");
//                if (isThisInMap(temp, direction)) {
//                    toReturnString = "Q";
//                }
//            }
//        }
//        return toReturnString;
//    }
//
//    private static boolean isThisInMap(String[] array, String direction) {
//        for (String s : array) {
//            if (s.equals(direction)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private static void command(){
//
//    }
//}
//
//
//
