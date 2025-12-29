import java.util.ArrayList;

class Library{
  ArrayList <Book> books = new ArrayList<>();
  
  void addBook(Book book){
    books.add(book);
  }
  void showBooks(){
    if(Books.size()==0){
      System.out.println("登録されている書籍はありません")
        }else{
      for(int i=0;i<books.size();i++){
        Book b=books.get(i);
        System.out.println((i+1)+":"+b.tiile+"/"+b.author+"/"+b.year);
      }
    }
  }
  boolean removeBook(int number){
    int index=number-1;
    
    if(number<1||number>
       books.size()){
    return false;
  }
  books.remove(index);
  return true;
  }
  int size(){
    return books.size();
  }
  }
  

  
