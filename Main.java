import java.util.*;

class Main {

    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; 
        }

        ListNode nextnode = head;
        ListNode nextnextnode = head;

        while (nextnextnode != null && nextnextnode.next != null) {
            nextnode = nextnode.next; 
            nextnextnode = nextnextnode.next.next; 

            if (nextnode == nextnextnode) {
                return true;
            }
        }

        return false;
    }



    public static void createCycle(ListNode head, int cycleStartIndex) {
        ListNode current = head;
        ListNode cycleStartNode = null;
        int index = 0;

        while (current.next != null) {
            if (index == cycleStartIndex) {
                cycleStartNode = current;
            }
            current = current.next;
            index++;
        }

        if (cycleStartNode != null) {
            current.next = cycleStartNode;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of nodes in the linked list: ");
        int nodeCount = scanner.nextInt();

        
        ListNode head = null;
        ListNode current = null;

        System.out.println("Enter the values for the nodes:");
        for (int i = 0; i < nodeCount; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int value = scanner.nextInt();
            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;  
                current = head;
            } else {
                current.next = newNode;  
                current = current.next;
            }
        }

        
        System.out.print("Do you want to create a cycle? (yes or no): ");
        String createCycleResponse = scanner.next().toLowerCase();

        if (createCycleResponse.equals("yes")) {
            System.out.print("Enter the index (0-based) to start the cycle: ");
            int cycleStartIndex = scanner.nextInt();
            createCycle(head, cycleStartIndex);
        }

        
        System.out.println("\nTest case: Checking if the list has a cycle");
        System.out.println("Does the list have a cycle? " + hasCycle(head));

        scanner.close();
        
    }
}
