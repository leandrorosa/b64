package com.lrosa

import picocli.CommandLine.Command
import picocli.CommandLine.Parameters
import java.nio.charset.Charset
import java.util.Base64
import java.util.concurrent.Callable

@Command(name = "decode", description = ["decode a base64 string"], aliases = ["d"])
class DecodeCommand : Callable<Int> {

    @Parameters(index = "0")
    private var value: String? = null

    override fun call(): Int {
        println(String(Base64.getDecoder().decode(value!!.toByteArray(Charset.defaultCharset()))))
        return 0
    }
}