class Book{
    public String Title;
    public String Author;
    public double Price;

     public void displayDetail(String Title,String Author,double Price){
         System.out.println("Book Details:");
         System.out.println("Title : "+Title+"\n"+"Author : "+Author+"\n"+"Price : "+Price);
     }
}
    class BookDetails {

    public static void main(String []args){
        Book obj = new Book();
        obj.displayDetail("Computer Basic","George",1200);

    }
}
