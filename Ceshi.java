package dyq1;

public class Ceshi {
	public static void main(String[] args) {
        try {
            System.out.println("�о���1");
            Doctor dyq = new Doctor();
            dyq.setName("������");
            dyq.setAge(20);
            dyq.setNumber(2019310861);
            dyq.setSex("��");
            dyq.setTuition(8000);
            dyq.setSalary(2000);
            System.out.println("ѧ������:" + dyq.getName());
            System.out.println("ѧ������:" + dyq.getAge());
            System.out.println("ѧ�����:" + dyq.getNumber());
            System.out.println("ѧ���Ա�:" + dyq.getSex());
            dyq.find_tuition();
            dyq.find_salary();
            dyq.taxation();
            System.out.println("�о���2");
            Doctor lyh = new Doctor();
            lyh.setName("������");
            lyh.setAge(20);
            lyh.setNumber(2019310111);
            lyh.setSex("Ů");
            lyh.setTuition(8000);
            lyh.setSalary(1525);
            System.out.println("ѧ������:" + lyh.getName());
            System.out.println("ѧ������:" + lyh.getAge());
            System.out.println("ѧ�����:" + lyh.getNumber());
            System.out.println("ѧ���Ա�:" + lyh.getSex());
            lyh.find_tuition();
            lyh.find_salary();
            lyh.taxation();
        } catch (Exception e) {
            System.out.println("�����쳣");
        }

    }

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


        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public void setTuition(double tuition) {
            this.tuition = tuition;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSex() {
            return sex;
        }

        public double getTuition() {
            return tuition;
        }

        public int getNumber() {
            return number;
        }

        public double getSalary() {
            return salary;
        }


        public double find_tuition() {
            System.out.println("ÿ��ѧ�ѣ�" + tuition);
            return tuition;
        }

        public double find_salary() {
            System.out.println("ÿ�¹��ʣ�" + salary);
            return salary;
        }

        public double afford_tuition() {
            System.out.println("���ɳɹ����ѽ���ѧ��" + tuition);
            return tuition;
        }

        public double get_salary() {
            double c;
            c = salary - (salary - 800) * STANDARD;
            System.out.println("нˮ�Ѿ����ţ����Ž�" + c);
            return salary;
        }

        public void taxation() {
            double a;
            a = 12 * ((salary - 800) * STANDARD);
            System.out.println("ÿ��Ӧ��˰Ϊ��" + a);
        }
    }
}
