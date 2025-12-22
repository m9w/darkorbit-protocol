package com.darkorbit

interface SynthesisListCommand : ProtocolPacket {
	var groups: MutableList<SynthesisGroupCommand>
}
