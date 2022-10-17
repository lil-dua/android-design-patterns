package tech.demoproject.android_design_patterns.creational_patterns.builder_pattern;

public class User {
    private String firstName;
    private String lastName;
    private int age;

    /**Buoc 3, chúng ta cần tạo hàm tạo với tất cả các tham số là Builder
     * Điều quan trọng ở đây là Constructor là private, vì vậy nó không thể được truy cập
     * từ lớp khác và chúng ta phải sử dụng Builder để tạo đối tượng mới.*/
   private User(final Builder builder){
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
   }

   protected void Print(){
       System.out.println("First name: "+firstName);
       System.out.println("Last name: "+lastName);
       System.out.println("Age: "+age);
   }

    /**Buoc 1, chúng ta cần tạo lớp Builder bên trong lớp User
     *  (static nested classes để tránh Memory leak nhé)*/
    static class Builder{
        private String firstName;
        private String lastName;
        private int age;

        /**Buoc 2,Đối với mỗi tham số chúng ta có một setter – sự khác biệt là những phương thức đó trả về
         * kiểu Builder. Cuối cùng chúng ta có một phương thức trả về User sử dụng Constructor của lớp User.*/
        public Builder setFirstName(final String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(final String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(final Integer age){
            this.age = age;
            return this;
        }

        public User create(){
            return new User(this);
        }
    }


}



