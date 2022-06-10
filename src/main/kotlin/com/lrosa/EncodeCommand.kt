package com.lrosa

import picocli.CommandLine.Command
import picocli.CommandLine.Parameters
import java.nio.charset.Charset
import java.util.Base64
import java.util.concurrent.Callable

@Command(name = "encode", description = ["encode a string with base64"], aliases = ["e"])
class EncodeCommand : Callable<Int> {

    @Parameters(index = "0")
    private var value: String? = null

    override fun call(): Int {
        println(String(Base64.getEncoder().encode(value!!.toByteArray(Charset.defaultCharset()))))
        return 0
    }
}