import Routes from './routes';
import styled from 'styled-components';

const Main = styled.main`

  height: 100vh;
  width: 100%;

`

const App = () => {
  return (
    <Main>
      <Routes />
    </Main>
  );
}

export default App;
