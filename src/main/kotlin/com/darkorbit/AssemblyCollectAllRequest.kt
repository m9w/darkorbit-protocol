package com.darkorbit

interface AssemblyCollectAllRequest : ProtocolPacket {
	var allRequests: MutableList<AssemblyCollectRequest>
}
