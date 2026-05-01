package task05.processing;

import task05.container.Pair;

public class InspectionUtils {
    public static <T> void logInspection(T item){
        public static <T> void logInspection(T item){
            System.out.println("=== INSPECTION LOG ===");
            System.out.println("Type:" + item.getClass().getSimpleName());
            System.out.println("Value: "+ item.toString());
            System.out.println("======================");

        }

        }

    }
}
