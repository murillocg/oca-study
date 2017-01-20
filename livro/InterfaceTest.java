interface IntefaceTest {
    void a();
}

class B implements IntefaceTest {
    void a() {  //Erro de compilação pois o método da interface é público e na classe é protected
    }
}