
class A {

}

class B {

}

class C extends A {

}

class D extends B {

}

//不能这样写，java不允许，会报错
//java只允许单继承，不允许多继承。C++ 支持多继承
// class E extends A,C{

// }


class X{

}

class Y extends X{

}

//其实这也说明了Z是继承了 Y 和 X的
//Z直接继承了Y，Z间接继承了X
class Z extends Y{

}