package com.darkorbit

interface EventANewHopeContributorListCommand : ProtocolPacket {
	var contributorList: MutableList<EventANewHopeContributorCommand>
}
