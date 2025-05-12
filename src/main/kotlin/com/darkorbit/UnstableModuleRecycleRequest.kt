package com.darkorbit

interface UnstableModuleRecycleRequest : ProtocolPacket {
	var itemId: Int
	var recycleReturns: Int
}
