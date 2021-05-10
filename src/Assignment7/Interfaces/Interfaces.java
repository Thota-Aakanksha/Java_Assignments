package Assignment7.Interfaces;

interface Interface1 {
    public void interface1Method1();
    public void interface1Method2();
}
interface Interface2{
    public void interface2Method1();
    public void interface2Method2();
}
interface Interface3{
    public void interface3Method1();
    public void interface3Method2();
}
interface CombinedInterface extends Interface1,Interface2, Interface3{
    public void combinedIntefaceMethod();

}