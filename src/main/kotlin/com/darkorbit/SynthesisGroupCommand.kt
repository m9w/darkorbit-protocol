package com.darkorbit

interface SynthesisGroupCommand : ProtocolPacket {
	var button: String
	var group: String
	var moduleList: MutableList<SynthesisModuleListCommand>
}
