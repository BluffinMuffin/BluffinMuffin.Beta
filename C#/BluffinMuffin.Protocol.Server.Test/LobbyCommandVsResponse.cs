﻿using System.Linq;
using BluffinMuffin.Protocol.Commands;
using BluffinMuffin.Protocol.Commands.Lobby;
using BluffinMuffin.Protocol.Commands.Lobby.Career;
using BluffinMuffin.Protocol.Commands.Lobby.Training;
using BluffinMuffin.Protocol.Server.Test.Mocking;
using BluffinMuffin.Protocols.Test.DataTypes;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace BluffinMuffin.Protocol.Server.Test
{
    [TestClass]
    public class LobbyCommandVsResponse
    {
        private void CheckIfResponseIs<T>(AbstractBluffinCommand c) where T : AbstractBluffinCommand
        {
            var server = new ServerMock();
            server.Send(c);
            server.LobbyCommands.CompleteAdding();
            var received = server.ServerSendedCommands.GetConsumingEnumerable().First();
            Assert.AreEqual(typeof(T), received.Command.GetType());
        }
        [TestMethod]
        public void AuthenticateUserCommand()
        {
            CheckIfResponseIs<AuthenticateUserResponse>(LobbyCommandMock.AuthenticateUserCommand());
        }
        [TestMethod]
        public void CheckDisplayExistCommand()
        {
            CheckIfResponseIs<CheckDisplayExistResponse>(LobbyCommandMock.CheckDisplayExistCommand());
        }
        [TestMethod]
        public void CheckUserExistCommand()
        {
            CheckIfResponseIs<CheckUserExistResponse>(LobbyCommandMock.CheckUserExistCommand());
        }
        [TestMethod]
        public void CreateTableCommand()
        {
            CheckIfResponseIs<CreateTableResponse>(LobbyCommandMock.CreateTableCommand());
        }
        [TestMethod]
        public void CreateUserCommand()
        {
            CheckIfResponseIs<CreateUserResponse>(LobbyCommandMock.CreateUserCommand());
        }
        [TestMethod]
        public void GetUserCommand()
        {
            CheckIfResponseIs<GetUserResponse>(LobbyCommandMock.GetUserCommand());
        }
        [TestMethod]
        public void IdentifyCommand()
        {
            CheckIfResponseIs<IdentifyResponse>(LobbyCommandMock.IdentifyCommand());
        }
        [TestMethod]
        public void JoinTableCommand()
        {
            CheckIfResponseIs<JoinTableResponse>(LobbyCommandMock.JoinTableCommand());
        }
        [TestMethod]
        public void ListTableCommand()
        {
            CheckIfResponseIs<ListTableResponse>(LobbyCommandMock.ListTableCommand());
        }
        [TestMethod]
        public void SupportedRulesCommand()
        {
            CheckIfResponseIs<SupportedRulesResponse>(LobbyCommandMock.SupportedRulesCommand());
        }
    }
}
