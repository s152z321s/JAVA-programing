public class Student {
    private String name;

    // 带参数的构造函数
    public Student(String name) {
        this.name = name;
    }

    // 默认构造函数，调用带参数的构造函数，给默认值
    public Student() {
        this("Irfan");
    }

    // 设置姓名
    public void setName(String name) {
        this.name = name;
    }

    // 获取姓名
    public String getName() {
        return this.name;
    }
}

