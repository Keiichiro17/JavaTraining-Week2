import java.util.ArrayList;

class Library{
  ArrayList <Book> books = new ArrayList<>();
//Libraryクラスは本の集合管理
//ArrayListはBookオブジェクトを保存、追加、削除

  //書籍を追加
  void addBook(Book book){
    books.add(book);
  }
  //登録されている書籍の一覧表示
  void showBooks(){
    if(books.size()==0){
      System.out.println("登録されている書籍はありません");
        }else{
      for(int i=0;i<books.size();i++){
        Book b=books.get(i);
        System.out.println((i+1)+":"+b.title+"/"+b.author+"/"+b.year);
      }
    }
  }
  //指定した番号の書籍の削除
  boolean removeBook(int number){
    int index=number-1;
    
    if(number<1||number>books.size()){
    return false;
  }
  books.remove(index);
  return true;
  }

  //登録冊数の表示
  int size(){
    return books.size();
  }
  }
  

  
