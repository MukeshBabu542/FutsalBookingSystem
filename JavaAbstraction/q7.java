package taskabstraction;


// 7. You are developing a restaurant management system that handles different types of employees, such as chefs and waiters.
// Design an interface named "Employee" with methods: work() and getSalary().

interface Employee {
    void work();
    double getSalary();
}

class Chef implements Employee {
    @Override
    public void work() {
        System.out.println("Chef is preparing meals.");
    }

    @Override
    public double getSalary() {
        return 50000;
    }
}

class Waiter implements Employee {
    @Override
    public void work() {
        System.out.println("Waiter is serving customers.");
    }

    @Override
    public double getSalary() {
        return 30000;
    }
}

public class q7 {
    public static void main(String[] args) {
        Employee chef = new Chef();
        Employee waiter = new Waiter();

        chef.work();
        System.out.println("Chef Salary: " + chef.getSalary());

        waiter.work();
        System.out.println("Waiter Salary: " + waiter.getSalary());
    }
}