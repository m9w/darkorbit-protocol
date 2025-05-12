package com.darkorbit

interface DispatchGetGateListCommand : ProtocolPacket {
	var gateList: MutableList<DispatchGateModule>
}
