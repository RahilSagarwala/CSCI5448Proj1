package observer;

// Interface referenced:
// https://learning.oreilly.com/library/view/head-first-design/0596007124/ch02.html
public interface iSubject {
   void addObserver(iObserver o);

   void removeObserver(iObserver o);

   void notifyObservers(iSubject s);
}
