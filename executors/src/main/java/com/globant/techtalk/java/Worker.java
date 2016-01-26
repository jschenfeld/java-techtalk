package com.globant.techtalk.java;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public interface Worker {

	<U> Future<U> process(Callable<U> task) throws Exception;

}
