package com.darkorbit

interface AddFireworkBoxCommand : AddMapEntityCommand {
	var colourCode: Int
	var eventModifier: String
	var typeId: Int
}
