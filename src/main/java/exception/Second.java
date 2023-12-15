package exception;

public class Second {

    public static void main(String[] args) {
        try {
            divide(4, 2); // 不会抛出异常
        } catch (MyException e) {
            System.out.println("Caught MyException: " + e.getMessage());
        }

        try {
            divide(4, 0); // 会抛出异常
        } catch (MyException e) {
            System.out.println("Caught MyException: " + e.getMessage());
        }

        try {
            createObject(-10); // 会抛出异常
        } catch (MyException e) {
            System.out.println("Caught MyException: " + e.getMessage());
        }

        try {
            searchSubstring("Hello, World!", "Java"); // 不会抛出异常
        } catch (MyException e) {
            System.out.println("Caught MyException: " + e.getMessage());
        }

        try {
            searchSubstring("Hello, World!", "Java", 15); // 会抛出异常
        } catch (MyException e) {
            System.out.println("Caught MyException: " + e.getMessage());
        }

        finally {
            // 清理资源，如关闭文件
        }
    }

    public static double divide(int a, int b) throws MyException {
        if(b == 0) {
            throw new MyException("Cannot divide by zero");
        }

        return a / b;
    }

    public static void createObject(int value) throws MyException {
        if(value < 0) {
            throw new MyException("Negative value not allowed");
        }

        // 创建对象，执行其他操作
    }

    public static void searchSubstring(String str, String search) throws MyException {
        if(!str.contains(search)) {
            throw new MyException("Substring not found");
        }

        // 执行其他操作
    }

    public static void searchSubstring(String str, String search, int index) throws MyException {
        if(index >= str.length()) {
            throw new MyException("Invalid index");
        }

        // 执行其他操作
    }
}