package com.darkorbit

interface SynthesisGroupCommand : ProtocolPacket {
	var group: String
	var modules: MutableList<SynthesisModuleCommand>
}
