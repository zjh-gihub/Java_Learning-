package Heima.JieKou;

/*
    测试类
 */
public class JumppingDemo {
    public static void main(String[] args) {
        //需求：创建接口操作类的对象，调用method方法
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.method(j);

        Jumpping d = new Dog();
        jo.method(d);

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高");
            }
        });
    }
}
