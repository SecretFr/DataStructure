# Learn DataStructure with JAVA
## Java Collection Framework
### List Collection
List 컬렉션을 사용하는 목적은 데이터들이 중복 저장이 가능할 때, 배열에 들어간 순서를 유지하고 싶을때, 해당 인터페이스의 기능들입니다.

* boolean add(E 객체): 주어진 객체를 list 컬렉션 맨 끝에 추가, 성공여부 반환
* void add(int index, E객체): 주어진 객체를 list 컬렉션 주어진 인덱스에 추가
* E set(int index, E객체): list 컬렉션 해당 인덱스에 위치한 객체를 들어온 객체로 교체하고, 기존에 있던 객체를 반환합니다.
* boolean contains(E객체): 객체가 list 컬렉션 내부에 존재하는지 찾습니다.
* E get(int index): list 컬렉션에서 주어진 index의 위치한 객체를 반환합니다.
* boolean isEmpty(): list 컬렉션이 비어있는지 반환합니다.
* int size(): list 컬렉션의 사이즈를 리턴합니다.
* void clear(): list 컬렉션에 저장된 모든 객체를 삭제합니다.
* E remove(int index): list 컬렉션에서 해당 index 위치의 객체를 삭제하고 반환합니다.
* boolean remove(int index): list 컬렉션 해당 index 위치의 객체를 삭제하고 성공여부를 반환합니다.

#### ArrayList
* 장점: 검색이 빠르다. 순차적으로 데이터가 추가된다면 빠르다.
* 단점: list들의 중간 중간 데이터에 빈번한 추가 삭제가 일어난다면 느리다. List 컬렉션을 여러 스레드에서 공유해야 한다면 Thread safe 하지 않다.

#### Vector
* ArrayList와 내부 구조는 동일하지만 Thread safe하다.

#### LinkedList
* 장점: 중간에 빈번한 삭제가 삽입이 일어날 때 좋은 성능을 발휘한다.
* 단점: 검색이 느리다.


### Set Collection
Set 컬렉션을 사용하는 목적은 순서가 필요없고, Set에 저장될 데이터가 중복이 되면 안될때 입니다. (단 LinkedHashSet은 순서도 보장합니다.)

* boolean add(E 객체): 주어진 객체를 set 컬렉션에 저장합니다.
* boolean contains(E 객체): 객체가 set 컬렉션 내부에 존재하는지 찾습니다.
* Itorator iterator(): set 컬렉션에 저장된 객체를 가져오는 반복자를 반환합니다.
* boolean isEmpty(): 컬렉션이 비어있는지 반환합니다.
* int size(): 컬렉션의 사이즈를 리턴합니다.
* void clear(): 컬렉션에 저장된 모든 객체를 삭제합니다.
* boolean remove(E 객체): 컬렉션에서 해당 객체를 삭제합니다.

#### HashSet
* 객체를 저장하기 전에 저장할 객체의 hashCode() 메소드를 호출해서 해쉬코드를 알아내고, set 내부의 hashCode와 비교하여 없을 때 저장한다. Thread safe하지 않다.

#### TreeSet
* 기본적으로 오름차순 정렬하여 저장한다. Thread safe 하지 않다.

#### LinkedHashSet
* 입력된 순서대로 저장한다. Thread safe 하지 않다.


