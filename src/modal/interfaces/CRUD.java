package modal.interfaces;

public interface CRUD<T> {
   void add(T value);
   void display();
   void edit(T value);
   void delete();

}