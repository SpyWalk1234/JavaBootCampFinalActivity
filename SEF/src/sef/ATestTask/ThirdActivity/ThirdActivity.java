package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        ta.validateUser("Ivan");
        ta.validateUser("Mike");
        ta.catchExeption();
        ta.catchMe(10, 2);
        ta.catchMe(10, 0);
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
		} catch (Exception e) {
            System.out.println("This should get printed even if there is an exception");
		}

    }

    void validateUser(String name) {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        boolean flag = false;
        //TODO if name in a list -> set flag=true
        // if at the end flag=0 -> throw the exeption
        for (int i = 0; i < validUsers.length; i++) {
        	if (validUsers[i] == name) {
        		flag = true;
        	}
        }
        if (flag == false) {
        	System.out.println(String.format("Name %s is invalid", name));
        } else {
        	System.out.println(String.format("Name %s is valid", name));
        }
    }

	void catchMe(int num1, int num2) {
		// TODO Catch exeption
		try {
			int result = num1 / num2;
			System.out.println("The result is: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Impossible to devide by 0");
		} finally {
			// TODO prints a message "Thank you for using this program." always
			System.out.println("Thank you for using this program.");
		}
	}
}

