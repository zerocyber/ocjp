package practice;

interface Pet { }

class Dog implements Pet { }

public class Beagle extends Dog{ }

/*Which three are valid?
A. Pet a = new Dog();
B. Pet b = new Pet();
C. Dog f = new Pet();
D. Dog d = new Beagle();
E. Pet e = new Beagle();
F. Beagle c = new Dog();*/

//정답은 ADE - 객체 변수쪽, 즉 왼쪽이 좀 더 상위인 것을 찾으면 된다. 
