package ru.unlimit.golovach.javacore.lab11.io;

import java.io.IOException;

interface PersonOutput{
	void write(Person person) throws IOException;
}