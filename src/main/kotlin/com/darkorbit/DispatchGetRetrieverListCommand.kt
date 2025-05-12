package com.darkorbit

interface DispatchGetRetrieverListCommand : ProtocolPacket {
	var retrieverList: MutableList<DispatchModule>
	var statusType: DispatchGetRetrieverListCommandStatusType
}
