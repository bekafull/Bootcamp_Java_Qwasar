class MyFirstClass {
    String names;
    MyFirstClass(String names){
        this.names = names;
    }
    public String getName(){
        return names;
    }
     public void setName(String names) {
        this.names = names;
    }
    public void name_print(){
        System.out.println(names);
    }
}