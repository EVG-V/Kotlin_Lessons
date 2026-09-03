class RequestBuilder() {
    var address: String = ""
    var method: String = ""
    var headers: String = ""
    var body: String = ""
    fun url(address: String) {
        this.address = address
    }
}

fun post(block: RequestBuilder.() -> Unit): RequestBuilder {
    val builder = RequestBuilder()
    builder.method = "POST"
    builder.block()
    return (builder)
}

fun put(block: RequestBuilder.() -> Unit): RequestBuilder {
    val builder = RequestBuilder()
    builder.method = "PUT"
    builder.block()
    return (builder)
}

fun delete(block: RequestBuilder.() -> Unit): RequestBuilder {
    val builder = RequestBuilder()
    builder.method = "DELETE"
    builder.block()
    return (builder)
}

fun get(block: RequestBuilder.() -> Unit): RequestBuilder {
    val builder = RequestBuilder()
    builder.method = "GET"
    builder.block()
    return (builder)

}


fun main() {
    val request = post {
        url("https://ya.ru")
        headers = "contentType(\"application/json\")\n" + "authorization(\"Bearer token\")"
        body = "(\"{\\\"name\\\": \\\"John\\\", \\\"age\\\": 30})"
    }
    println(request.address + "\n" + request.method + "\n" + request.headers + "\n" + request.body)

    val request2 = put {
        url("https://ya.ru")
        headers = "contentType(\"application/json\")\n" + "authorization(\"Bearer token\")"
        body = "(\"{\\\"name\\\": \\\"John\\\", \\\"age\\\": 31})"
    }
    println(request2.address + "\n" + request2.method + "\n" + request2.headers + "\n" + request2.body)

    val request3 = delete {
        url("https://ya.ru")
        headers = "contentType(\"application/json\")\n" + "authorization(\"Bearer token\")"
        body = "(\"{\\\"id\\\": 1})"
    }
    println(request3.address + "\n" + request3.method + "\n" + request3.headers + "\n" + request3.body)

    val request4 = get {
        url("https://ya.ru")
        headers = "contentType(\"application/json\")\n" + "authorization(\"Bearer token\")"
    }
    println(request4.address + "\n" + request4.method + "\n" + request4.headers)
}

