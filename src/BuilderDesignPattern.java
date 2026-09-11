class Product{
    private String receptant;
    private String subject;
    private String Cc;
    private String Bc;
    private String body;
    private Product(Builder builder){
        this.receptant=builder.receptant;
        this.subject=builder.subject;
        this.Cc=builder.Cc;
        this.Bc=builder.Bc;
        this.body=builder.body;
    }
    public String getreceptant(){
        return receptant;
    }
    public String getsubject(){
        return subject;
    }
    public String getCc(){
        return Cc;
    }
    public String getBc(){
        return Bc;
    }
    public String getbody(){
        return body;
    }
    public String toString() {
        return "Product{" +
                "receptant='" + receptant + '\'' +
                ", subject='" + subject + '\'' +
                ", Cc='" + Cc + '\'' +
                ", Bc='" + Bc + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
    public static class Builder{
        private String receptant;
        private String subject;
        private String Cc;
        private String Bc;
        private String body;
        public Builder(String receptant,String body){
            this.receptant=receptant;
            this.body=body;
        }
        public Builder setsubject(String subject){
            this.subject=subject;
            return this;
        }
        public Builder setcc(String Cc){
            this.Cc=Cc;
            return this;
        }
        public Builder setbc(String Bc){
            this.Bc=Bc;
            return this;
        }
        public Product build(){
            return new Product(this);
        }
    }
}
public class BuilderDesignPattern {
    public static void main(String[] args){
        Product product=new Product.Builder("enithaps10@gmail.com","Hi enitha").setbc("yuvan@gmail.com").build();
        System.out.println(product);
    }
}
