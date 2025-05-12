package com.darkorbit

interface PetBuffCommand : ProtocolPacket {
	var addingParameters: MutableList<Int>
	var effectAction: PetBuffCommandAction
	var effectId: Short
}
