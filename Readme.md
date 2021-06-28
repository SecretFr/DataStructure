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
