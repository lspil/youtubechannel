module helloen {

    requires hello;

    provides hello.HelloWorld with en.hello.EnHelloWorld;
}
