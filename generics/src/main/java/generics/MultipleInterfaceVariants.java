package generics;//: generics/MultipleInterfaceVariants.java
// {CompileTimeError} (Won't compile)

interface Payable<T> {}

//TODO 姚云哲此处验证错误，注释掉
public class MultipleInterfaceVariants{}
//class Employee implements Payable<Employee> {}
//class Hourly extends Employee
//  implements Payable<Hourly> {} ///:~
