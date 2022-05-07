package MaasHesaplayici;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Kemal",2000,40,1985);
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        employee.print();
    }
}
