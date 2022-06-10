package com.lrosa

import io.quarkus.picocli.runtime.annotations.TopCommand
import picocli.CommandLine
import picocli.CommandLine.Command
import java.util.concurrent.Callable
import kotlin.system.exitProcess

@TopCommand
@Command(name = "b64", description = ["Base 64 encoder/decoder"], subcommands = [EncodeCommand::class, DecodeCommand::class])
class B64Command : Callable<Int> {
    override fun call(): Int {
        return 0
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            exitProcess(CommandLine(B64Command()).execute(*args))
        }
    }
}