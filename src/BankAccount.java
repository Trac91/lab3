
public abstract class BankAccount implements Taxable, Transactable {

    protected String name;
    protected  int accNum;

    public BankAccount(String name,int accNum)
    {
        setName(name);
        setAccNum(accNum);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public String toString()
    {
        return "Name: " + getName() + "  Account Num: " + getAccNum();
    }
}
