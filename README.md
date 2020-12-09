# java3

## 实验目的
掌握Java中抽象类和抽象方法的定义； 

掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法

了解异常的使用方法，并在程序中根据输入情况做异常处理

## 实验方法

1.设计两个管理接口

2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。

3.编写测试类

## 实验过程

1.创建package创建class.

2.创建主类,用interface创建老师与学生的接口.

3.编写老师与学生的属性变量并进行实例化（姓名、性别、年龄、每学期学费、每月薪水）set()赋值get()获取返回值,以及计算方法.

4.最后完善主类,用try catch进行异常处理.

## 核心方法

```
interface Manger_student {
        double find_tuition();

        double afford_tuition();
    }

    interface Manger_teacher {
        double STANDARD = 0.2;

        double find_salary();

        double get_salary();
    }


    public static class Doctor implements Manger_student, Manger_teacher {
        public Doctor() {

        }

        public Doctor(String name, int age, int number, String sex, double tuition, double salary) {
            this.name = name;
            this.age = age;
            this.number = number;
            this.sex = sex;
            this.tuition = tuition;
            this.salary = salary;
        }

        private String name;
        private int age;
        private int number;
        private String sex;
        private double tuition;
        private double salary;
        
```

# 实验结果

研究生1

学生姓名:杜雨卿

学生年龄:20

学生编号:2019310861

学生性别:男

每年学费：8000.0

每月工资：2000.0

每年应纳税为：2880.0

研究生2

学生姓名:李永红

学生年龄:20

学生编号:2019310111

学生性别:女

每年学费：8000.0

每月工资：1525.0

每年应纳税为：1740.0

# 实验感想

本次实验难度与上次实验相近，主要利用interface创建接口,掌握了接口的定义形式以及接口的实现方法，编写程序时需要对属性的计算方法特别留意，由于使用double，数字格式还必须一样，需要时刻想着.最后用trycatch对主类进行异常处理，也了解了异常的使用方法，并在程序中根据输入情况做异常处理。



