package com.darkorbit

interface SynthesisModuleListCommand : ProtocolPacket {
	var moduleListGroupType: String
	var modules: MutableList<SynthesisModuleCommand>
}
